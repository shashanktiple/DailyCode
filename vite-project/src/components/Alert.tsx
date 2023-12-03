import React, { ReactNode } from "react";

interface Props{
children: ReactNode;
}


export default function Alert(p: Props){
    return(<>
    <div className="alert alert-primary">{p.children}</div></>)

}