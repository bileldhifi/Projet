FROM node:16.3.0-alpine

WORKDIR /usr/src/app

COPY package*.json .

RUN npm i

COPY . .

CMD ["npm","start"]