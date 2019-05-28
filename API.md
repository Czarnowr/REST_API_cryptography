**Cryptography Demo REST API**
----
  _Returns json message after encoding / decoding_

* **URL**

  _/encode/atbash_
  _/decode/atbash_

* **Method:**

  `POST`
  
*  **URL Params**

   **Required:**
 
   `n/a`

   **Optional:**
 
   `n/a`

* **Data Params**

  **Content:** `{ "request" : "text to process" }`

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{ "response" : "text after processing" }`
 
* **Error Response:**

  * **Code:** 422 UNPROCESSABLE ENTRY <br />
    **Content:** `{ error : Input does not contain letters }`  
    
    * **Code:** 422 UNPROCESSABLE ENTRY <br />
    **Content:** `{ error : Cannot process an empty String, please provide input }`

* **Sample Call:**

   

* **Notes:**

  <_This is where all uncertainties, commentary, discussion etc. can go. I recommend timestamping and identifying oneself when leaving comments here._> 