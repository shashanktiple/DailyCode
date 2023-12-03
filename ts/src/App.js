import "./App.css";
import { useEffect, useState } from "react";

function CountryCapitalGame() {
  const [items, setItems] = useState([]);
  const [selected, setSelected] = useState(null);
  const [wrongSelected, setWrongSelected] = useState(null);
  const [matchedPairs, setMatchedPairs] = useState(new Set());
  const [listButtons, setListButtons] = useState([]);

  const data = {
    Poland: "Warsaw",
    Germany: "Berlin",
    Azerbaijan: "Baku",
    "Papua New Guinea": "Port Moresby",
  };

  function initButtonList() {
    data.map((obj, i) => {
      listButtons.push(obj);
    });
  }

  useEffect(() => {
    const shuffledItems = Object.entries(data)
      .flatMap(([country, capital]) => [country, capital])
      .sort(() => 0.5 - Math.random());
    setItems(shuffledItems);
    // }
  }, []);

  const handleButtonClick = (item) => {
    if (wrongSelected) {
      setSelected(item);
      setWrongSelected(null);
      return;
    }
    if (selected !== item) {
      if (selected) {
        if (
          (data[selected] && data[selected] === item) ||
          (data[item] && data[item] === selected)
        ) {
          setMatchedPairs(new Set([...matchedPairs, selected, item]));
          setSelected(null);
        } else {
          // Wrong pair selected
          //setSelected(null);
          setWrongSelected(item);
        }
      } else {
        setSelected(item);
      }
    }
  };

  if (items.length === matchedPairs.size) {
    return <div>Congratulations</div>;
  }

  return (
    <div>
      {items.map((item) => {
        if (matchedPairs.has(item)) return null;
        let style = {};
        if (wrongSelected === item) {
          style.backgroundColor = "#ff0000";
        }
        if (item === selected) {
          if (wrongSelected != null) style.backgroundColor = "#ff0000";
          else style.backgroundColor = "#0000ff";
        }

        return (
          <button key={item}style={style} onClick={() => handleButtonClick(item)}>{item}</button>
        );
      })}
    </div>
  );
}

export default CountryCapitalGame;
