.class Ln3/n$a;
.super Lc4/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln3/n;-><init>(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc4/h<",
        "Ln3/n$b<",
        "TA;>;TB;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Ln3/n;


# direct methods
.method constructor <init>(Ln3/n;J)V
    .locals 0

    iput-object p1, p0, Ln3/n$a;->e:Ln3/n;

    invoke-direct {p0, p2, p3}, Lc4/h;-><init>(J)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ln3/n$b;

    invoke-virtual {p0, p1, p2}, Ln3/n$a;->n(Ln3/n$b;Ljava/lang/Object;)V

    return-void
.end method

.method protected n(Ln3/n$b;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/n$b<",
            "TA;>;TB;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ln3/n$b;->c()V

    return-void
.end method
