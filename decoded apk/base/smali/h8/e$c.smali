.class final Lh8/e$c;
.super Lg8/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh8/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private f:Lw6/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw6/h$a<",
            "Lh8/e$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lw6/h$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw6/h$a<",
            "Lh8/e$c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lg8/o;-><init>()V

    iput-object p1, p0, Lh8/e$c;->f:Lw6/h$a;

    return-void
.end method


# virtual methods
.method public final x()V
    .locals 1

    iget-object v0, p0, Lh8/e$c;->f:Lw6/h$a;

    invoke-interface {v0, p0}, Lw6/h$a;->a(Lw6/h;)V

    return-void
.end method
