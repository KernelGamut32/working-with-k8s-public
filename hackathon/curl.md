REGISTER:
curl --location 'http://localhost:5050/register' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id": 0,
    "name": "Bob Roberts",
    "email": "broberts@test.com",
    "password": "password456"
}'

LOGIN:
curl --location 'http://localhost:5050/login' \
--header 'Content-Type: application/json' \
--data-raw '{
    "email": "broberts@test.com",
    "password": "password456"
}'

CREATE TOY:
curl --location 'http://localhost:5000/auth/toys' \
--header 'x-access-token: eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJVc2VySUQiOjEsIk5hbWUiOiJNZWxpc3NhIFRlc3RpbmciLCJFbWFpbCI6Im10ZXN0aW5nQHRlc3QuY29tIiwiZXhwIjoxNjQ1NTg1ODgwfQ.pS9RNqQU9wLfihvYqkBcFaWZsb9emV-a4WAywT1uIlrTXybWye6-UokwTZdK0SNh3q6lDP6on_S402Q-jHyEbTcnBJFv2fv1_Xm184QATBB3lRO75Wv62Km8e0aKq6q4AkOb16OiR3x1pW0gKekbS4MCQecPiyVispL9loHkCzWJwLV6Bk5v1SjnZXRsldVWaM1n_jnG_0kWwtRm9_NlJFEp5ubhU7Urq2m78_iqwHrctczp-VyXnicDtToH0ZRaGVNbAVXQT6nkKHPzWpNHCxzeVnoYT_sfZlsaxZw5Em3k03HrxVEDjEK8fqhZn4q62JpMco83I4s18cdxPD_6RQ' \
--header 'Content-Type: application/json' \
--data '{
    "id": 0,
    "productNumber": "GHIJKL999",
    "name": "Lincoln Logs",
    "description": "Feed the creative in you",
    "unitCost": 39.99
}'

GET TOYS:
curl --location 'http://localhost:5000/auth/toys' \
--header 'x-access-token: eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJVc2VySUQiOjEsIk5hbWUiOiJNZWxpc3NhIFRlc3RpbmciLCJFbWFpbCI6Im10ZXN0aW5nQHRlc3QuY29tIiwiZXhwIjoxNjQ1NTg1ODgwfQ.pS9RNqQU9wLfihvYqkBcFaWZsb9emV-a4WAywT1uIlrTXybWye6-UokwTZdK0SNh3q6lDP6on_S402Q-jHyEbTcnBJFv2fv1_Xm184QATBB3lRO75Wv62Km8e0aKq6q4AkOb16OiR3x1pW0gKekbS4MCQecPiyVispL9loHkCzWJwLV6Bk5v1SjnZXRsldVWaM1n_jnG_0kWwtRm9_NlJFEp5ubhU7Urq2m78_iqwHrctczp-VyXnicDtToH0ZRaGVNbAVXQT6nkKHPzWpNHCxzeVnoYT_sfZlsaxZw5Em3k03HrxVEDjEK8fqhZn4q62JpMco83I4s18cdxPD_6RQ' \
--data '' -X GET

GET TOY:
curl --location 'http://localhost:5000/auth/toys/1' \
--header 'x-access-token: eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJVc2VySUQiOjEsIk5hbWUiOiJNZWxpc3NhIFRlc3RpbmciLCJFbWFpbCI6Im10ZXN0aW5nQHRlc3QuY29tIiwiZXhwIjoxNjQ1NTg1ODgwfQ.pS9RNqQU9wLfihvYqkBcFaWZsb9emV-a4WAywT1uIlrTXybWye6-UokwTZdK0SNh3q6lDP6on_S402Q-jHyEbTcnBJFv2fv1_Xm184QATBB3lRO75Wv62Km8e0aKq6q4AkOb16OiR3x1pW0gKekbS4MCQecPiyVispL9loHkCzWJwLV6Bk5v1SjnZXRsldVWaM1n_jnG_0kWwtRm9_NlJFEp5ubhU7Urq2m78_iqwHrctczp-VyXnicDtToH0ZRaGVNbAVXQT6nkKHPzWpNHCxzeVnoYT_sfZlsaxZw5Em3k03HrxVEDjEK8fqhZn4q62JpMco83I4s18cdxPD_6RQ' \
--data '' -X GET

UPDATE TOY:
curl --location --request PUT 'http://localhost:5000/auth/toys/1' \
--header 'x-access-token: eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJVc2VySUQiOjEsIk5hbWUiOiJNZWxpc3NhIFRlc3RpbmciLCJFbWFpbCI6Im10ZXN0aW5nQHRlc3QuY29tIiwiZXhwIjoxNjQ1NTg1ODgwfQ.pS9RNqQU9wLfihvYqkBcFaWZsb9emV-a4WAywT1uIlrTXybWye6-UokwTZdK0SNh3q6lDP6on_S402Q-jHyEbTcnBJFv2fv1_Xm184QATBB3lRO75Wv62Km8e0aKq6q4AkOb16OiR3x1pW0gKekbS4MCQecPiyVispL9loHkCzWJwLV6Bk5v1SjnZXRsldVWaM1n_jnG_0kWwtRm9_NlJFEp5ubhU7Urq2m78_iqwHrctczp-VyXnicDtToH0ZRaGVNbAVXQT6nkKHPzWpNHCxzeVnoYT_sfZlsaxZw5Em3k03HrxVEDjEK8fqhZn4q62JpMco83I4s18cdxPD_6RQ' \
--header 'Content-Type: application/json' \
--data '{
    "id": 1,
    "productNumber": "GHIJKL999",
    "name": "Lincoln Logs",
    "description": "Feed the creative in you",
    "unitCost": 39.99
}'

DELETE TOY:
curl --location --request DELETE 'http://localhost:5000/auth/toys/1' \
--header 'x-access-token: eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJVc2VySUQiOjEsIk5hbWUiOiJNZWxpc3NhIFRlc3RpbmciLCJFbWFpbCI6Im10ZXN0aW5nQHRlc3QuY29tIiwiZXhwIjoxNjQ1NTg1ODgwfQ.pS9RNqQU9wLfihvYqkBcFaWZsb9emV-a4WAywT1uIlrTXybWye6-UokwTZdK0SNh3q6lDP6on_S402Q-jHyEbTcnBJFv2fv1_Xm184QATBB3lRO75Wv62Km8e0aKq6q4AkOb16OiR3x1pW0gKekbS4MCQecPiyVispL9loHkCzWJwLV6Bk5v1SjnZXRsldVWaM1n_jnG_0kWwtRm9_NlJFEp5ubhU7Urq2m78_iqwHrctczp-VyXnicDtToH0ZRaGVNbAVXQT6nkKHPzWpNHCxzeVnoYT_sfZlsaxZw5Em3k03HrxVEDjEK8fqhZn4q62JpMco83I4s18cdxPD_6RQ' \
--data ''

GET INVENTORY:
curl --location 'http://localhost:5100/inventory/GHIJKL999' -X GET

UPDATE INVENTORY:
curl --location --request PUT 'http://localhost:5100/inventory/1' \
--header 'Content-Type: application/json' \
--data '{
    "id": 1,
    "productNumber": "GHIJKL999",
    "quantity": 42
}'