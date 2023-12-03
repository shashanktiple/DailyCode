import React, { useState } from "react";


export default function Exc(){

    const [Show, setShow] = useState(false);

    return(
    <>
    <button className="btn btn-primary" onClick={()=> setShow(true)}>Button</button>

{Show? 
    <div className="alert alert-primary alert-dismissible" >My Alert 
    <button type="button" className="btn-close" data-bs-dismiss="alert" aria-label="Close" onClick={()=>setShow(!Show)} ></button>
    </div>:null
    
}

    </>
    )
}