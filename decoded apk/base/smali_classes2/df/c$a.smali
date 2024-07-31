.class final Ldf/c$a;
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
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Ldf/a;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Ldf/c$a;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;

.field private static final e:Ljd/c;

.field private static final f:Ljd/c;

.field private static final g:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldf/c$a;

    invoke-direct {v0}, Ldf/c$a;-><init>()V

    sput-object v0, Ldf/c$a;->a:Ldf/c$a;

    const-string v0, "packageName"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$a;->b:Ljd/c;

    const-string v0, "versionName"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$a;->c:Ljd/c;

    const-string v0, "appBuildVersion"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$a;->d:Ljd/c;

    const-string v0, "deviceManufacturer"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$a;->e:Ljd/c;

    const-string v0, "currentProcessDetails"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$a;->f:Ljd/c;

    const-string v0, "appProcessDetails"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$a;->g:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ldf/a;Ljd/e;)V
    .locals 2

    sget-object v0, Ldf/c$a;->b:Ljd/c;

    invoke-virtual {p1}, Ldf/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Ldf/c$a;->c:Ljd/c;

    invoke-virtual {p1}, Ldf/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Ldf/c$a;->d:Ljd/c;

    invoke-virtual {p1}, Ldf/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Ldf/c$a;->e:Ljd/c;

    invoke-virtual {p1}, Ldf/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Ldf/c$a;->f:Ljd/c;

    invoke-virtual {p1}, Ldf/a;->c()Ldf/t;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Ldf/c$a;->g:Ljd/c;

    invoke-virtual {p1}, Ldf/a;->b()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ldf/a;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Ldf/c$a;->a(Ldf/a;Ljd/e;)V

    return-void
.end method
