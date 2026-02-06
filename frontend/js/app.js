const BASE = "http://localhost:8080";

function addVehicle() {
    fetch(BASE + "/vehicles", {
        method: "POST",
        headers: {"Content-Type":"application/json"},
        body: JSON.stringify({
            ownerName: owner.value,
            vehicleNumber: vnum.value,
            model: model.value
        })
    }).then(()=>alert("Added"));
}

function book() {
    fetch(BASE + "/bookings", {
        method: "POST",
        headers: {"Content-Type":"application/json"},
        body: JSON.stringify({
            vehicleNumber: number.value,
            serviceType: type.value,
            date: date.value
        })
    }).then(()=>alert("Booked"));
}

function loadMechanics(){
    fetch(BASE + "/mechanics")
    .then(r=>r.json())
    .then(data=>{
        list.innerHTML="";
        data.forEach(m=>{
            list.innerHTML += `<li>${m.name} - ${m.location} - ${m.phone}</li>`;
        });
    });
}
