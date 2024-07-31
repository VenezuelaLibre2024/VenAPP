.class final Lxc/a$n;
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
    name = "n"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lxc/f0$e$d$a$b$c;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lxc/a$n;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;

.field private static final e:Ljd/c;

.field private static final f:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxc/a$n;

    invoke-direct {v0}, Lxc/a$n;-><init>()V

    sput-object v0, Lxc/a$n;->a:Lxc/a$n;

    const-string v0, "type"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$n;->b:Ljd/c;

    const-string v0, "reason"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$n;->c:Ljd/c;

    const-string v0, "frames"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$n;->d:Ljd/c;

    const-string v0, "causedBy"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$n;->e:Ljd/c;

    const-string v0, "overflowCount"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$n;->f:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lxc/f0$e$d$a$b$c;Ljd/e;)V
    .locals 2

    sget-object v0, Lxc/a$n;->b:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a$b$c;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$n;->c:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a$b$c;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$n;->d:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a$b$c;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$n;->e:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a$b$c;->b()Lxc/f0$e$d$a$b$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$n;->f:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a$b$c;->d()I

    move-result p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;I)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lxc/f0$e$d$a$b$c;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lxc/a$n;->a(Lxc/f0$e$d$a$b$c;Ljd/e;)V

    return-void
.end method
