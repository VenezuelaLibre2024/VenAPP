.class public Lx8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Lx8/b;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lx8/b;-><init>(ILjava/lang/String;Ljava/lang/String;Lx8/b;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Lx8/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lx8/b;->a:I

    iput-object p2, p0, Lx8/b;->b:Ljava/lang/String;

    iput-object p3, p0, Lx8/b;->c:Ljava/lang/String;

    iput-object p4, p0, Lx8/b;->d:Lx8/b;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lx8/b;->a:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx8/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx8/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/ads/internal/client/c3;
    .locals 13

    iget-object v0, p0, Lx8/b;->d:Lx8/b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v4, v0, Lx8/b;->c:Ljava/lang/String;

    iget-object v3, v0, Lx8/b;->b:Ljava/lang/String;

    iget v2, v0, Lx8/b;->a:I

    new-instance v0, Lcom/google/android/gms/ads/internal/client/c3;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/ads/internal/client/c3;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/c3;Landroid/os/IBinder;)V

    :goto_0
    move-object v11, v0

    iget v8, p0, Lx8/b;->a:I

    iget-object v9, p0, Lx8/b;->b:Ljava/lang/String;

    iget-object v10, p0, Lx8/b;->c:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/ads/internal/client/c3;

    const/4 v12, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/google/android/gms/ads/internal/client/c3;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/c3;Landroid/os/IBinder;)V

    return-object v0
.end method

.method public e()Lorg/json/JSONObject;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "Code"

    iget v2, p0, Lx8/b;->a:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "Message"

    iget-object v2, p0, Lx8/b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "Domain"

    iget-object v2, p0, Lx8/b;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lx8/b;->d:Lx8/b;

    const-string v2, "Cause"

    if-nez v1, :cond_0

    const-string v1, "null"

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lx8/b;->e()Lorg/json/JSONObject;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lx8/b;->e()Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "Error forming toString output."

    :goto_0
    return-object v0
.end method
