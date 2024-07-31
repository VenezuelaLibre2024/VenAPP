.class final Lxc/a$l;
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
    name = "l"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lxc/f0$e$d$a$b$a;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lxc/a$l;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;

.field private static final e:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxc/a$l;

    invoke-direct {v0}, Lxc/a$l;-><init>()V

    sput-object v0, Lxc/a$l;->a:Lxc/a$l;

    const-string v0, "baseAddress"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$l;->b:Ljd/c;

    const-string v0, "size"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$l;->c:Ljd/c;

    const-string v0, "name"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$l;->d:Ljd/c;

    const-string v0, "uuid"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$l;->e:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lxc/f0$e$d$a$b$a;Ljd/e;)V
    .locals 3

    sget-object v0, Lxc/a$l;->b:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a$b$a;->b()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    sget-object v0, Lxc/a$l;->c:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a$b$a;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    sget-object v0, Lxc/a$l;->d:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a$b$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$l;->e:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a$b$a;->f()[B

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lxc/f0$e$d$a$b$a;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lxc/a$l;->a(Lxc/f0$e$d$a$b$a;Ljd/e;)V

    return-void
.end method
