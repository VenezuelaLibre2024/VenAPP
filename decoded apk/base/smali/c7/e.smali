.class abstract Lc7/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc7/e$a;
    }
.end annotation


# instance fields
.field protected final a:Ly6/b0;


# direct methods
.method protected constructor <init>(Ly6/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/e;->a:Ly6/b0;

    return-void
.end method


# virtual methods
.method public final a(Lt8/e0;J)Z
    .locals 1

    invoke-virtual {p0, p1}, Lc7/e;->b(Lt8/e0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lc7/e;->c(Lt8/e0;J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected abstract b(Lt8/e0;)Z
.end method

.method protected abstract c(Lt8/e0;J)Z
.end method
