.class final Lg6/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lg6/k;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lg6/b$c;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg6/b$c;

    invoke-direct {v0}, Lg6/b$c;-><init>()V

    sput-object v0, Lg6/b$c;->a:Lg6/b$c;

    const-string v0, "clientType"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$c;->b:Ljd/c;

    const-string v0, "androidClientInfo"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$c;->c:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lg6/k;Ljd/e;)V
    .locals 2

    sget-object v0, Lg6/b$c;->b:Ljd/c;

    invoke-virtual {p1}, Lg6/k;->c()Lg6/k$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lg6/b$c;->c:Ljd/c;

    invoke-virtual {p1}, Lg6/k;->b()Lg6/a;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lg6/k;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lg6/b$c;->a(Lg6/k;Ljd/e;)V

    return-void
.end method
