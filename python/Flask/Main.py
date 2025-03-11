from flask import Flask, send_from_directory

app = Flask(__name__, static_folder="src/", root_path="static/", static_url_path="/")

@app.route('/')
def home():
    return send_from_directory("static", "index.html")

if __name__ == '__main__':
    app.run(debug=True, port=8080)
