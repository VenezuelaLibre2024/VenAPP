.class final Lae/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbk/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lae/b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbk/a<",
        "Lcc/a;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lae/d;


# direct methods
.method constructor <init>(Lae/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lae/b$b$a;->a:Lae/d;

    return-void
.end method


# virtual methods
.method public a()Lcc/a;
    .locals 1

    iget-object v0, p0, Lae/b$b$a;->a:Lae/d;

    invoke-interface {v0}, Lae/d;->r()Lcc/a;

    move-result-object v0

    invoke-static {v0}, Lrd/d;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcc/a;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lae/b$b$a;->a()Lcc/a;

    move-result-object v0

    return-object v0
.end method
