.class final Lxc/a$v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxc/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "v"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lxc/f0$e$d$e;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lxc/a$v;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;

.field private static final e:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxc/a$v;

    invoke-direct {v0}, Lxc/a$v;-><init>()V

    sput-object v0, Lxc/a$v;->a:Lxc/a$v;

    const-string v0, "rolloutVariant"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$v;->b:Ljd/c;

    const-string v0, "parameterKey"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$v;->c:Ljd/c;

    const-string v0, "parameterValue"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$v;->d:Ljd/c;

    const-string v0, "templateVersion"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$v;->e:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lxc/f0$e$d$e;Ljd/e;)V
    .locals 3

    sget-object v0, Lxc/a$v;->b:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$e;->d()Lxc/f0$e$d$e$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$v;->c:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$e;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$v;->d:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$v;->e:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$e;->e()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lxc/f0$e$d$e;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lxc/a$v;->a(Lxc/f0$e$d$e;Ljd/e;)V

    return-void
.end method
