.class final Ldf/c$b;
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
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Ldf/b;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Ldf/c$b;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;

.field private static final e:Ljd/c;

.field private static final f:Ljd/c;

.field private static final g:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldf/c$b;

    invoke-direct {v0}, Ldf/c$b;-><init>()V

    sput-object v0, Ldf/c$b;->a:Ldf/c$b;

    const-string v0, "appId"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$b;->b:Ljd/c;

    const-string v0, "deviceModel"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$b;->c:Ljd/c;

    const-string v0, "sessionSdkVersion"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$b;->d:Ljd/c;

    const-string v0, "osVersion"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$b;->e:Ljd/c;

    const-string v0, "logEnvironment"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$b;->f:Ljd/c;

    const-string v0, "androidAppInfo"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$b;->g:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ldf/b;Ljd/e;)V
    .locals 2

    sget-object v0, Ldf/c$b;->b:Ljd/c;

    invoke-virtual {p1}, Ldf/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Ldf/c$b;->c:Ljd/c;

    invoke-virtual {p1}, Ldf/b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Ldf/c$b;->d:Ljd/c;

    invoke-virtual {p1}, Ldf/b;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Ldf/c$b;->e:Ljd/c;

    invoke-virtual {p1}, Ldf/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Ldf/c$b;->f:Ljd/c;

    invoke-virtual {p1}, Ldf/b;->d()Ldf/s;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Ldf/c$b;->g:Ljd/c;

    invoke-virtual {p1}, Ldf/b;->a()Ldf/a;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ldf/b;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Ldf/c$b;->a(Ldf/b;Ljd/e;)V

    return-void
.end method
