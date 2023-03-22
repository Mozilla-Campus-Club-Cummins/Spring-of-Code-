let gsci = document.getElementById("gsci")
const quiz = document.getElementById("quiz")
quiz.style.display = 'none'
let score = 0;


gsci.addEventListener("click", () => {
    score = 0;
    let questions = [
        {
            question: "Which of the following is the smallest unit of life?",
            choices: ['Cell', 'Molecule', 'Atom', 'Gene'],
            correct: 1

        },
        {
            question: "Which of the following is not a greenhouse gas?",
            choices: ["CO2", "CH4", "Nitrogen", "Water Vapour"],
            correct: 3
        },
        {
            question: "What is the largest planet in our solar system?",
            choices: ["Mercury", "Venus", "Earth", "Jupiter"],
            correct: 4
        },
        {
            question: "What is the process by which plants use sunlight to make food?",
            choices: ["Photosynthesis", "Respiration", "Digestion", "Fermentation"],
            correct: 1
        },
        {
            question: "What is the formula for water?",
            choices: ["NaCl", "H2O", "CO2", "H2CO3"],
            correct: 2
        }

    ]

    let h4 = quiz.querySelector('h4')
    let radio = quiz.querySelectorAll('input')
    let label = quiz.querySelectorAll('label')
    quiz.style.display = 'block'

    function recur(i, list) {
        if(i<list.length){
            console.log(i+1)
            h4.innerText = `${list[i].question}`
            for (j = 0; j < label.length; j++) {
                label[j].innerText = `${list[i].choices[j]}`
                radio[j].value = `${list[i].choices[j]}`
            }
        

        setTimeout(() => {

            for (j = 0; j < radio.length; j++) {
                console.log(radio[j].checked)
                if (radio[j].checked) {
                    console.log(radio[j].value + " is checked")
                    // break;
                    if ((j + 1) == list[i].correct) {
                        console.log("Ans is correct " + (j + 1))
                        score+=4;
                        console.log(score)
                    }
                    else {
                        console.log("Ans is incorrect " + (j + 1))
                        score-=1
                        console.log(score)
                    }
                    radio[j].checked = false


                }

            }
            if (i < list.length) {
                ++i;
                recur(i, list)
                
            }
        }, 3000)
    }
    else{
        html=`<div class="card">
        <div class="card-header">
          Time Up!!!
        </div>
        <div class="card-body">
          <h5 class="card-title">Your Score</h5>
          <h1 id="score">${score}</h1>
        </div>
      </div>`
      quiz.innerHTML=html
    }

    }
    recur(0, questions)


})

let csci = document.getElementById("csci")
csci.addEventListener("click", () => {
    score = 0;
    let questions = [
        {
            question: "Which of the following is a popular database management system?",
            choices: ['Oracle', 'Microsoft Excel', ' Adobe Photoshop', 'Mozilla Firefox'],
            correct: 1

        },
        {
            question: "Which of the following is not an operating system?",
            choices: ["Windows", "Linux", "Android", "Microsoft Office"],
            correct: 4
        },
        {
            question: "Which of the following is a type of network topology where each node is connected to every other node?",
            choices: ["Star", "Bus", "Ring", "Mesh"],
            correct: 4
        },
        {
            question: "What is the name of the first web browser?",
            choices: ["Internet Explorer", "Firefox", "Netscape Navigator", "Google Chrome"],
            correct: 3
        },
        {
            question: "Which of the following is a protocol used for secure communication over the internet?",
            choices: ["FTP", "HTTP", "SSL/TLS", "SMTP"],
            correct: 3
        }

    ]

    let h4 = quiz.querySelector('h4')
    let radio = quiz.querySelectorAll('input')
    let label = quiz.querySelectorAll('label')
    quiz.style.display = 'block'

    function recur(i, list) {
        if(i<list.length){
            console.log(i+1)
            h4.innerText = `${list[i].question}`
            for (j = 0; j < label.length; j++) {
                label[j].innerText = `${list[i].choices[j]}`
                radio[j].value = `${list[i].choices[j]}`
            }
        

        setTimeout(() => {

            for (j = 0; j < radio.length; j++) {
                console.log(radio[j].checked)
                if (radio[j].checked) {
                    console.log(radio[j].value + " is checked")
                    // break;
                    if ((j + 1) == list[i].correct) {
                        console.log("Ans is correct " + (j + 1))
                        score+=4;
                        console.log(score)
                    }
                    else {
                        console.log("Ans is incorrect " + (j + 1))
                        score-=1
                        console.log(score)
                    }
                    radio[j].checked = false


                }

            }
            if (i < list.length) {
                ++i;
                recur(i, list)
                
            }
        }, 3000)
    }
    else{
        html=`<div class="card">
        <div class="card-header">
          Time Up!!!
        </div>
        <div class="card-body">
          <h5 class="card-title">Your Score</h5>
          <h1 id="score">${score}</h1>
        </div>
      </div>`
      quiz.innerHTML=html
    }

    }
    recur(0, questions)


})