import React, {Component} from 'react';

class Footer extends Component {
    render() {
        return (
            <footer className="bg-dark">
                <div className="container pb-1 pb-lg-5">
                    <div className="row content-space-t-2">
                        <div className="col-lg-3 mb-7 mb-lg-0">
                            <div className="mb-5">
                                <a className="navbar-brand" href="./index.html" aria-label="Space">
                                    <img className="navbar-brand-logo" src="./assets/svg/logos/logo-white.svg"
                                         alt="Image Description" />
                                </a>
                            </div>

                            <ul className="list-unstyled list-py-1">
                                <li><a className="link-sm link-light" href="#"><i
                                    className="bi-geo-alt-fill me-1"></i> 153 Williamson Plaza, Maggieberg</a></li>
                                <li><a className="link-sm link-light" href="tel:1-062-109-9222"><i
                                    className="bi-telephone-inbound-fill me-1"></i> +1 (062) 109-9222</a></li>
                            </ul>

                        </div>

                        <div className="col-sm mb-7 mb-sm-0">
                            <h5 className="text-white mb-3">Company</h5>

                            <ul className="list-unstyled list-py-1 mb-0">
                                <li><a className="link-sm link-light" href="#">About</a></li>
                                <li><a className="link-sm link-light" href="#">Careers <span
                                    className="badge bg-warning text-dark rounded-pill ms-1">We're hiring</span></a>
                                </li>
                                <li><a className="link-sm link-light" href="#">Blog</a></li>
                                <li><a className="link-sm link-light" href="#">Customers <i
                                    className="bi-box-arrow-up-right small ms-1"></i></a></li>
                                <li><a className="link-sm link-light" href="#">Hire us</a></li>
                            </ul>

                        </div>

                        <div className="col-sm mb-7 mb-sm-0">
                            <h5 className="text-white mb-3">Features</h5>


                            <ul className="list-unstyled list-py-1 mb-0">
                                <li><a className="link-sm link-light" href="#">Press <i
                                    className="bi-box-arrow-up-right small ms-1"></i></a></li>
                                <li><a className="link-sm link-light" href="#">Release Notes</a></li>
                                <li><a className="link-sm link-light" href="#">Integrations</a></li>
                                <li><a className="link-sm link-light" href="#">Pricing</a></li>
                            </ul>

                        </div>

                        <div className="col-sm">
                            <h5 className="text-white mb-3">Documentation</h5>

                            <ul className="list-unstyled list-py-1 mb-0">
                                <li><a className="link-sm link-light" href="#">Support</a></li>
                                <li><a className="link-sm link-light" href="#">Docs</a></li>
                                <li><a className="link-sm link-light" href="#">Status</a></li>
                                <li><a className="link-sm link-light" href="#">API Reference</a></li>
                                <li><a className="link-sm link-light" href="#">Tech Requirements</a></li>
                            </ul>

                        </div>

                        <div className="col-sm">
                            <h5 className="text-white mb-3">Resources</h5>

                            <ul className="list-unstyled list-py-1 mb-5">
                                <li><a className="link-sm link-light" href="#"><i
                                    className="bi-question-circle-fill me-1"></i> Help</a></li>
                                <li><a className="link-sm link-light" href="#"><i
                                    className="bi-person-circle me-1"></i> Your Account</a></li>
                            </ul>
                        </div>
                    </div>

                    <div className="border-top border-white-10 my-7"></div>

                    <div className="row mb-7">
                        <div className="col-sm mb-3 mb-sm-0">
                            <ul className="list-inline list-separator list-separator-light mb-0">
                                <li className="list-inline-item">
                                    <a className="link-sm link-light" href="#">Privacy &amp; Policy</a>
                                </li>
                                <li className="list-inline-item">
                                    <a className="link-sm link-light" href="#">Terms</a>
                                </li>
                                <li className="list-inline-item">
                                    <a className="link-sm link-light" href="#">Site Map</a>
                                </li>
                            </ul>
                        </div>

                        <div className="col-sm-auto">
                            <ul className="list-inline mb-0">
                                <li className="list-inline-item">
                                    <a className="btn btn-soft-light btn-xs btn-icon" href="#">
                                        <i className="bi-facebook"></i>
                                    </a>
                                </li>

                                <li className="list-inline-item">
                                    <a className="btn btn-soft-light btn-xs btn-icon" href="#">
                                        <i className="bi-google"></i>
                                    </a>
                                </li>

                                <li className="list-inline-item">
                                    <a className="btn btn-soft-light btn-xs btn-icon" href="#">
                                        <i className="bi-twitter"></i>
                                    </a>
                                </li>

                                <li className="list-inline-item">
                                    <a className="btn btn-soft-light btn-xs btn-icon" href="#">
                                        <i className="bi-github"></i>
                                    </a>
                                </li>

                                <li className="list-inline-item">
                                    <div className="btn-group">
                                        <button type="button" className="btn btn-soft-light btn-xs dropdown-toggle"
                                                id="footerSelectLanguage" data-bs-toggle="dropdown"
                                                aria-expanded="false" data-bs-dropdown-animation>
                  <span className="d-flex align-items-center">
                    <img className="avatar avatar-xss avatar-circle me-2"
                         src="./assets/vendor/flag-icon-css/flags/1x1/us.svg" alt="Image description" width="16"/>
                    <span>English (US)</span>
                  </span>
                                        </button>

                                        <div className="dropdown-menu" aria-labelledby="footerSelectLanguage">
                                            <a className="dropdown-item d-flex align-items-center active" href="#">
                                                <img className="avatar avatar-xss avatar-circle me-2"
                                                     src="./assets/vendor/flag-icon-css/flags/1x1/us.svg"
                                                     alt="Image description" width="16"/>
                                                <span>English (US)</span>
                                            </a>
                                            <a className="dropdown-item d-flex align-items-center" href="#">
                                                <img className="avatar avatar-xss avatar-circle me-2"
                                                     src="./assets/vendor/flag-icon-css/flags/1x1/de.svg"
                                                     alt="Image description" width="16"/>
                                                <span>Deutsch</span>
                                            </a>
                                            <a className="dropdown-item d-flex align-items-center" href="#">
                                                <img className="avatar avatar-xss avatar-circle me-2"
                                                     src="./assets/vendor/flag-icon-css/flags/1x1/es.svg"
                                                     alt="Image description" width="16"/>
                                                <span>Español</span>
                                            </a>
                                            <a className="dropdown-item d-flex align-items-center" href="#">
                                                <img className="avatar avatar-xss avatar-circle me-2"
                                                     src="./assets/vendor/flag-icon-css/flags/1x1/cn.svg"
                                                     alt="Image description" width="16"/>
                                                <span>中文 (繁體)</span>
                                            </a>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>

                    <div className="w-md-85 text-lg-center mx-lg-auto">
                        <p className="text-white-50 small">&copy; Front. 2021 Htmlstream. All rights reserved.</p>
                        <p className="text-white-50 small">When you visit or interact with our sites, services or tools,
                            we or our authorised service providers may use cookies for storing information to help
                            provide you with a better, faster and safer experience and for marketing purposes.</p>
                    </div>
                </div>
            </footer>

    );
    }
}

export default Footer;