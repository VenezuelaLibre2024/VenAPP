.class final Lg6/b$b;
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
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lg6/j;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lg6/b$b;

.field private static final b:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg6/b$b;

    invoke-direct {v0}, Lg6/b$b;-><init>()V

    sput-object v0, Lg6/b$b;->a:Lg6/b$b;

    const-string v0, "logRequest"

    invoke-static {v0}, Ljd/c;->d(Ljava/lang/String;)Ljd/c;

    move-result-object v0

    sput-object v0, Lg6/b$b;->b:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lg6/j;Ljd/e;)V
    .locals 1

    sget-object v0, Lg6/b$b;->b:Ljd/c;

    invoke-virtual {p1}, Lg6/j;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lg6/j;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lg6/b$b;->a(Lg6/j;Ljd/e;)V

    return-void
.end method
