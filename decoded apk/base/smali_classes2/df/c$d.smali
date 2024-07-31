.class final Ldf/c$d;
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
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Ldf/t;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Ldf/c$d;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;

.field private static final e:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldf/c$d;

    invoke-direct {v0}, Ldf/c$d;-><init>()V

    sput-object v0, Ldf/c$d;->a:Ldf/c$d;

    const-string v0, "processName"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$d;->b:Ljd/c;

    const-string v0, "pid"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$d;->c:Ljd/c;

    const-string v0, "importance"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$d;->d:Ljd/c;

    const-string v0, "defaultProcess"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Ldf/c$d;->e:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ldf/t;Ljd/e;)V
    .locals 2

    sget-object v0, Ldf/c$d;->b:Ljd/c;

    invoke-virtual {p1}, Ldf/t;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Ldf/c$d;->c:Ljd/c;

    invoke-virtual {p1}, Ldf/t;->b()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;I)Ljd/e;

    sget-object v0, Ldf/c$d;->d:Ljd/c;

    invoke-virtual {p1}, Ldf/t;->a()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;I)Ljd/e;

    sget-object v0, Ldf/c$d;->e:Ljd/c;

    invoke-virtual {p1}, Ldf/t;->d()Z

    move-result p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Z)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ldf/t;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Ldf/c$d;->a(Ldf/t;Ljd/e;)V

    return-void
.end method
