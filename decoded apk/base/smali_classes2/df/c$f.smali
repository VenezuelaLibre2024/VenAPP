.class final Ldf/c$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Ldf/e0;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Ldf/c$f;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;

.field private static final e:Ljd/c;

.field private static final f:Ljd/c;

.field private static final g:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldf/c$f;

    invoke-direct {v0}, Ldf/c$f;-><init>()V

    sput-object v0, Ldf/c$f;->a:Ldf/c$f;

    const-string v0, "sessionId"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$f;->b:Ljd/c;

    const-string v0, "firstSessionId"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$f;->c:Ljd/c;

    const-string v0, "sessionIndex"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$f;->d:Ljd/c;

    const-string v0, "eventTimestampUs"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$f;->e:Ljd/c;

    const-string v0, "dataCollectionStatus"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$f;->f:Ljd/c;

    const-string v0, "firebaseInstallationId"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$f;->g:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ldf/e0;Ljd/e;)V
    .locals 3

    sget-object v0, Ldf/c$f;->b:Ljd/c;

    invoke-virtual {p1}, Ldf/e0;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Ldf/c$f;->c:Ljd/c;

    invoke-virtual {p1}, Ldf/e0;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Ldf/c$f;->d:Ljd/c;

    invoke-virtual {p1}, Ldf/e0;->f()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;I)Ljd/e;

    sget-object v0, Ldf/c$f;->e:Ljd/c;

    invoke-virtual {p1}, Ldf/e0;->b()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    sget-object v0, Ldf/c$f;->f:Ljd/c;

    invoke-virtual {p1}, Ldf/e0;->a()Ldf/e;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Ldf/c$f;->g:Ljd/c;

    invoke-virtual {p1}, Ldf/e0;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ldf/e0;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Ldf/c$f;->a(Ldf/e0;Ljd/e;)V

    return-void
.end method
