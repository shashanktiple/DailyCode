import React, { useState } from "react";



interface Props{
  item: string[];
  heading: string;
  onSelectItem:(item: string) =>void;
}

export default function ListGroup(props: Props) {
  

  const [Indx, setIndx] = useState(-1)

  return (
    <>
      <h1>{props.heading} </h1>

      <ul className="list-group">
      {props.item.length === 0? "no item found": props.item.map((item, index) => 
      (<li className={Indx === index ? "list-group-item active" : "list-group-item"} key={item} 
      onClick={()=>{setIndx(index); props.onSelectItem(item) }}>{item}</li>))}
      </ul>
      
    </>
  );
}
