.class final Lg6/i$b;
.super Lg6/o$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg6/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Lg6/o$c;

.field private b:Lg6/o$b;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lg6/o$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lg6/o;
    .locals 4

    new-instance v0, Lg6/i;

    iget-object v1, p0, Lg6/i$b;->a:Lg6/o$c;

    iget-object v2, p0, Lg6/i$b;->b:Lg6/o$b;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lg6/i;-><init>(Lg6/o$c;Lg6/o$b;Lg6/i$a;)V

    return-object v0
.end method

.method public b(Lg6/o$b;)Lg6/o$a;
    .locals 0

    iput-object p1, p0, Lg6/i$b;->b:Lg6/o$b;

    return-object p0
.end method

.method public c(Lg6/o$c;)Lg6/o$a;
    .locals 0

    iput-object p1, p0, Lg6/i$b;->a:Lg6/o$c;

    return-object p0
.end method
