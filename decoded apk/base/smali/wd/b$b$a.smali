.class final Lwd/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbk/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwd/b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbk/a<",
        "Lud/g;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lwd/f;


# direct methods
.method constructor <init>(Lwd/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwd/b$b$a;->a:Lwd/f;

    return-void
.end method


# virtual methods
.method public a()Lud/g;
    .locals 1

    iget-object v0, p0, Lwd/b$b$a;->a:Lwd/f;

    invoke-interface {v0}, Lwd/f;->a()Lud/g;

    move-result-object v0

    invoke-static {v0}, Ltd/d;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lud/g;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwd/b$b$a;->a()Lud/g;

    move-result-object v0

    return-object v0
.end method
