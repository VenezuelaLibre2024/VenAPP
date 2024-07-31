.class final Lxc/a$m;
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
    name = "m"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lxc/f0$e$d$a$b;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lxc/a$m;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;

.field private static final e:Ljd/c;

.field private static final f:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxc/a$m;

    invoke-direct {v0}, Lxc/a$m;-><init>()V

    sput-object v0, Lxc/a$m;->a:Lxc/a$m;

    const-string v0, "threads"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$m;->b:Ljd/c;

    const-string v0, "exception"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$m;->c:Ljd/c;

    const-string v0, "appExitInfo"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$m;->d:Ljd/c;

    const-string v0, "signal"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$m;->e:Ljd/c;

    const-string v0, "binaries"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$m;->f:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lxc/f0$e$d$a$b;Ljd/e;)V
    .locals 2

    sget-object v0, Lxc/a$m;->b:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a$b;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$m;->c:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a$b;->d()Lxc/f0$e$d$a$b$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$m;->d:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a$b;->b()Lxc/f0$a;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$m;->e:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a$b;->e()Lxc/f0$e$d$a$b$d;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$m;->f:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a$b;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lxc/f0$e$d$a$b;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lxc/a$m;->a(Lxc/f0$e$d$a$b;Ljd/e;)V

    return-void
.end method
