.class final Lxc/a$p;
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
    name = "p"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lxc/f0$e$d$a$b$e;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lxc/a$p;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxc/a$p;

    invoke-direct {v0}, Lxc/a$p;-><init>()V

    sput-object v0, Lxc/a$p;->a:Lxc/a$p;

    const-string v0, "name"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$p;->b:Ljd/c;

    const-string v0, "importance"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$p;->c:Ljd/c;

    const-string v0, "frames"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$p;->d:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lxc/f0$e$d$a$b$e;Ljd/e;)V
    .locals 2

    sget-object v0, Lxc/a$p;->b:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a$b$e;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lxc/a$p;->c:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a$b$e;->c()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;I)Ljd/e;

    sget-object v0, Lxc/a$p;->d:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$a$b$e;->b()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lxc/f0$e$d$a$b$e;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lxc/a$p;->a(Lxc/f0$e$d$a$b$e;Ljd/e;)V

    return-void
.end method
