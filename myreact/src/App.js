import "./App.css";
import React from "react";
import { useState } from "react";

export default function App() {
  const [time, setTime] = useState(0);
  const [id, setID] = useState(null);

  const startTimer = () => {
    setID(setInterval(() => {setTime((a) => a + 1);}, 1000));
  };
  const stopTimer = () => {clearInterval(id);};

  return (
    <>
      <button onClick={startTimer}>Start</button>
      <button onClick={stopTimer}>Stop</button>
      <p>Timer: {time}</p>
    </>
  );
}

//-----------------------------------------
// ----import Counter from "./App1";
// export default function App() {
//   const [isShow, setisShow] = useState(false);
//   return (
//     <>
//       <button
//         onClick={() => {
//           setisShow(!isShow);
//         }}
//       >
//         {isShow ? "Hide Counter" : "Show Counter"}
//       </button>
//       <br />
//       <br />
//       <br />
//       {isShow ? <Counter /> : null}
//     </>
//   );
// }
// //-----
// function Counter() {
//   const [count, setCount] = useState(0);
//   return (
//     <>
//       <button onClick={() => setCount(count + 1)}>Increment</button>
//       <button onClick={() => setCount(0)}>Reset</button>
//       <p>Count: {count}</p>
//     </>
//   );
// }

//-------------------------------------------------
// export default function App() {
//   const [count, setCount] = useState(0);

//   return (
//     <>
//       <Fun count={count} setCount={setCount} />
//       <Fun count={count} setCount={setCount} />
//       <Fun count={count} setCount={setCount} />
//     </>
//   );
// }

// function Fun({ count, setCount }) {
//   return (
//     <>
//       <button onClick={() => setCount(count + 1)}>Click</button>
//       <p>Count: {count}</p>
//     </>
//   );
// }
//-------------------------------------------------
// export default function App() {
//   return (
//     <>
//       <Fun a={10} />
//       <Fun />
//       <Fun />
//     </>
//   );

//   function Fun({ a = 0 }) {
//     const [count, setCount] = useState(a);
//     return (
//       <>
//         <div className="div1">
//           <button onClick={() => setCount(count + 1)}>Click Me</button>
//           <p>Count: {count}</p>
//           <button onClick={() => setCount(a)}>Reset</button>
//           <br />
//           <br />
//         </div>
//       </>
//     );
//   }
// }
