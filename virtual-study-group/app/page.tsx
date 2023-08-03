"use client"
import axios from 'axios'
import Image from 'next/image'
import { useEffect, useState } from 'react';

export default function Home() {
  const [info, setInfo] = useState();

  const getInfo = () => {
    axios
      .get("http://localhost:8080", {
        headers: {
          Authorization: "Bearer "
        },
      })
      .then((response) => {
        setInfo(response.data);
      })
      .catch((error) => {
        console.error(error);
      });
  };

  useEffect(() => {
    getInfo();
  }, []);

  return (
    <>
    <div>Gome</div>
    <div>{info}</div>
    </>
  )
}
