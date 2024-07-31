.class final Lg6/e$b;
.super Lg6/k$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg6/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Lg6/k$b;

.field private b:Lg6/a;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lg6/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lg6/k;
    .locals 4

    new-instance v0, Lg6/e;

    iget-object v1, p0, Lg6/e$b;->a:Lg6/k$b;

    iget-object v2, p0, Lg6/e$b;->b:Lg6/a;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lg6/e;-><init>(Lg6/k$b;Lg6/a;Lg6/e$a;)V

    return-object v0
.end method

.method public b(Lg6/a;)Lg6/k$a;
    .locals 0

    iput-object p1, p0, Lg6/e$b;->b:Lg6/a;

    return-object p0
.end method

.method public c(Lg6/k$b;)Lg6/k$a;
    .locals 0

    iput-object p1, p0, Lg6/e$b;->a:Lg6/k$b;

    return-object p0
.end method
