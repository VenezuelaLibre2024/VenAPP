.class public Lhf/k;
.super Lhf/e;
.source "SourceFile"


# instance fields
.field private final m:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(Lgf/h;Lzb/g;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lhf/e;-><init>(Lgf/h;Lzb/g;)V

    iput-object p3, p0, Lhf/k;->m:Lorg/json/JSONObject;

    const-string p1, "X-HTTP-Method-Override"

    const-string p2, "PATCH"

    invoke-virtual {p0, p1, p2}, Lhf/e;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string v0, "PUT"

    return-object v0
.end method

.method protected g()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lhf/k;->m:Lorg/json/JSONObject;

    return-object v0
.end method
