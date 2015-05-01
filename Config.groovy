environments {

    dev {
        ui {
          url = 'http://localhost:3001'
        }

        api {
          url = 'http://localhost:3000'
        }
    }

    test {
      ui {
        url = 'https://potus-ui.herokuapp.com'
      }

      api {
        url = 'https://potus-api.herokuapp.com'
      }
    }

}
