.class final Lbl/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzk/b3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbl/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Lzk/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzk/m<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final synthetic b:Lzk/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzk/n<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# virtual methods
.method public final a()Lzk/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lzk/m<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbl/b$b;->a:Lzk/m;

    return-object v0
.end method

.method public f(Lel/e0;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lel/e0<",
            "*>;I)V"
        }
    .end annotation

    iget-object v0, p0, Lbl/b$b;->b:Lzk/n;

    invoke-virtual {v0, p1, p2}, Lzk/n;->f(Lel/e0;I)V

    return-void
.end method
