.class final Lxc/a$t;
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
    name = "t"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lxc/f0$e$d;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lxc/a$t;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;

.field private static final e:Ljd/c;

.field private static final f:Ljd/c;

.field private static final g:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxc/a$t;

    invoke-direct {v0}, Lxc/a$t;-><init>()V

    sput-object v0, Lxc/a$t;->a:Lxc/a$t;

    const-string v0, "timestamp"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$t;->b:Ljd/c;

    const-string v0, "type"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$t;->c:Ljd/c;

    const-string v0, "app"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$t;->d:Ljd/c;

    const-string v0, "device"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$t;->e:Ljd/c;

    const-string v0, "log"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$t;->f:Ljd/c;

    const-string v0, "rollouts"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$t;->g:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lxc/f0$e$d;Ljd/e;)V
    .locals 3

    sget-object v0, Lxc/a$t;->b:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d;->f()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    sget-object v0, Lxc/a$t;->c:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$t;->d:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d;->b()Lxc/f0$e$d$a;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$t;->e:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d;->c()Lxc/f0$e$d$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$t;->f:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d;->d()Lxc/f0$e$d$d;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$t;->g:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d;->e()Lxc/f0$e$d$f;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lxc/f0$e$d;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lxc/a$t;->a(Lxc/f0$e$d;Ljd/e;)V

    return-void
.end method
