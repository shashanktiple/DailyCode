
import Alert from "./components/Alert";
import Button from "./components/Button";
import Exc from "./components/Exc";
// import ListGroup from "./components/ListGroup";


export default function App(){
  // const item = ["delhi", "pune", "mumbai", "hyderabad"];
  // const handleSelectItem =(item) =>{console.log(item);}
  
return (<>
{/* <div><ListGroup item ={item} heading={"Cities"} onSelectItem={handleSelectItem}/></div> */}
<div ><Alert>Hello <span>World</span></Alert></div>
<Button color= "primary" onClick={()=> console.log('Clicked')}>My Button</Button>
<br />
<br />

<Exc/>


</>)


}