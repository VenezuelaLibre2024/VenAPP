.class final Lxc/a$x;
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
    name = "x"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lxc/f0$e$d$f;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lxc/a$x;

.field private static final b:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxc/a$x;

    invoke-direct {v0}, Lxc/a$x;-><init>()V

    sput-object v0, Lxc/a$x;->a:Lxc/a$x;

    const-string v0, "assignments"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lxc/a$x;->b:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lxc/f0$e$d$f;Ljd/e;)V
    .locals 1

    sget-object v0, Lxc/a$x;->b:Ljd/c;

    invoke-virtual {p1}, Lxc/f0$e$d$f;->b()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lxc/f0$e$d$f;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lxc/a$x;->a(Lxc/f0$e$d$f;Ljd/e;)V

    return-void
.end method
