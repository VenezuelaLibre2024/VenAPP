.class public final Lcom/google/firebase/perf/network/b;
.super Ljavax/net/ssl/HttpsURLConnection;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/firebase/perf/network/c;

.field private final b:Ljavax/net/ssl/HttpsURLConnection;


# direct methods
.method constructor <init>(Ljavax/net/ssl/HttpsURLConnection;Lcom/google/firebase/perf/util/l;Lse/h;)V
    .locals 1

    invoke-virtual {p1}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    invoke-direct {p0, v0}, Ljavax/net/ssl/HttpsURLConnection;-><init>(Ljava/net/URL;)V

    iput-object p1, p0, Lcom/google/firebase/perf/network/b;->b:Ljavax/net/ssl/HttpsURLConnection;

    new-instance v0, Lcom/google/firebase/perf/network/c;

    invoke-direct {v0, p1, p2, p3}, Lcom/google/firebase/perf/network/c;-><init>(Ljava/net/HttpURLConnection;Lcom/google/firebase/perf/util/l;Lse/h;)V

    iput-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    return-void
.end method


# virtual methods
.method public addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/perf/network/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public connect()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->b()V

    return-void
.end method

.method public disconnect()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->c()V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/network/c;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getAllowUserInteraction()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->d()Z

    move-result v0

    return v0
.end method

.method public getCipherSuite()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->b:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getCipherSuite()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getConnectTimeout()I
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->e()I

    move-result v0

    return v0
.end method

.method public getContent()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->f()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getContent([Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/network/c;->g([Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getContentEncoding()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getContentLength()I
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->i()I

    move-result v0

    return v0
.end method

.method public getContentLengthLong()J
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->j()J

    move-result-wide v0

    return-wide v0
.end method

.method public getContentType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDate()J
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->l()J

    move-result-wide v0

    return-wide v0
.end method

.method public getDefaultUseCaches()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->m()Z

    move-result v0

    return v0
.end method

.method public getDoInput()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->n()Z

    move-result v0

    return v0
.end method

.method public getDoOutput()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->o()Z

    move-result v0

    return v0
.end method

.method public getErrorStream()Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->p()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public getExpiration()J
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->q()J

    move-result-wide v0

    return-wide v0
.end method

.method public getHeaderField(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/network/c;->r(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getHeaderField(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/network/c;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getHeaderFieldDate(Ljava/lang/String;J)J
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/firebase/perf/network/c;->t(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public getHeaderFieldInt(Ljava/lang/String;I)I
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/perf/network/c;->u(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public getHeaderFieldKey(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/network/c;->v(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getHeaderFieldLong(Ljava/lang/String;J)J
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/firebase/perf/network/c;->w(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public getHeaderFields()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->x()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->b:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v0

    return-object v0
.end method

.method public getIfModifiedSince()J
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->y()J

    move-result-wide v0

    return-wide v0
.end method

.method public getInputStream()Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->z()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public getInstanceFollowRedirects()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->A()Z

    move-result v0

    return v0
.end method

.method public getLastModified()J
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->B()J

    move-result-wide v0

    return-wide v0
.end method

.method public getLocalCertificates()[Ljava/security/cert/Certificate;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->b:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getLocalCertificates()[Ljava/security/cert/Certificate;

    move-result-object v0

    return-object v0
.end method

.method public getLocalPrincipal()Ljava/security/Principal;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->b:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getLocalPrincipal()Ljava/security/Principal;

    move-result-object v0

    return-object v0
.end method

.method public getOutputStream()Ljava/io/OutputStream;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->C()Ljava/io/OutputStream;

    move-result-object v0

    return-object v0
.end method

.method public getPeerPrincipal()Ljava/security/Principal;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->b:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getPeerPrincipal()Ljava/security/Principal;

    move-result-object v0

    return-object v0
.end method

.method public getPermission()Ljava/security/Permission;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->D()Ljava/security/Permission;

    move-result-object v0

    return-object v0
.end method

.method public getReadTimeout()I
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->E()I

    move-result v0

    return v0
.end method

.method public getRequestMethod()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->F()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getRequestProperties()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->G()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getRequestProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/network/c;->H(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getResponseCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->I()I

    move-result v0

    return v0
.end method

.method public getResponseMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->J()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->b:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    return-object v0
.end method

.method public getServerCertificates()[Ljava/security/cert/Certificate;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->b:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getServerCertificates()[Ljava/security/cert/Certificate;

    move-result-object v0

    return-object v0
.end method

.method public getURL()Ljava/net/URL;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->K()Ljava/net/URL;

    move-result-object v0

    return-object v0
.end method

.method public getUseCaches()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->L()Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->hashCode()I

    move-result v0

    return v0
.end method

.method public setAllowUserInteraction(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/network/c;->M(Z)V

    return-void
.end method

.method public setChunkedStreamingMode(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/network/c;->N(I)V

    return-void
.end method

.method public setConnectTimeout(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/network/c;->O(I)V

    return-void
.end method

.method public setDefaultUseCaches(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/network/c;->P(Z)V

    return-void
.end method

.method public setDoInput(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/network/c;->Q(Z)V

    return-void
.end method

.method public setDoOutput(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/network/c;->R(Z)V

    return-void
.end method

.method public setFixedLengthStreamingMode(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/network/c;->S(I)V

    return-void
.end method

.method public setFixedLengthStreamingMode(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/perf/network/c;->T(J)V

    return-void
.end method

.method public setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->b:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    return-void
.end method

.method public setIfModifiedSince(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/perf/network/c;->U(J)V

    return-void
.end method

.method public setInstanceFollowRedirects(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/network/c;->V(Z)V

    return-void
.end method

.method public setReadTimeout(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/network/c;->W(I)V

    return-void
.end method

.method public setRequestMethod(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/network/c;->X(Ljava/lang/String;)V

    return-void
.end method

.method public setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/perf/network/c;->Y(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->b:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    return-void
.end method

.method public setUseCaches(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/network/c;->Z(Z)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public usingProxy()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/network/b;->a:Lcom/google/firebase/perf/network/c;

    invoke-virtual {v0}, Lcom/google/firebase/perf/network/c;->b0()Z

    move-result v0

    return v0
.end method
