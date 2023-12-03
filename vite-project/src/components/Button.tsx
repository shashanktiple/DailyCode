import React from "react";

interface Props{
    children: string;
    onClick: ()=> void;
    color ?: "primary" | "danger" | 'secondary';
}

export default function Button(p: Props){
    return(
        <>
        <button type="button" className={"btn btn-"+p.color} onClick={p.onClick}>{p.children}</button>
        </>
    )
}