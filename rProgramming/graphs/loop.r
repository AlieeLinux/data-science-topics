name <- readline(prompt = "Enter your name: ")
cat("Hello,", name, "!\n")


answer <- 89 * 33

user <- readline(prompt = "what is 89 times 33?\n>>")


while (answer != user) {
  user <- readline(prompt = "Wrong!!\n>>")
}
print("correct!!")
