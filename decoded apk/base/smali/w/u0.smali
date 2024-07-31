.class public Lw/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/u0$a;
    }
.end annotation


# instance fields
.field private final a:Lw/u0$a;


# direct methods
.method public constructor <init>(Landroid/util/Size;Landroid/graphics/Rect;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lw/e$b;

    invoke-direct {v0}, Lw/e$b;-><init>()V

    invoke-virtual {v0, p1}, Lw/e$b;->d(Landroid/util/Size;)Lw/u0$a$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lw/u0$a$a;->b(Landroid/graphics/Rect;)Lw/u0$a$a;

    move-result-object p1

    invoke-virtual {p1, p3}, Lw/u0$a$a;->c(I)Lw/u0$a$a;

    move-result-object p1

    invoke-virtual {p1}, Lw/u0$a$a;->a()Lw/u0$a;

    move-result-object p1

    iput-object p1, p0, Lw/u0;->a:Lw/u0$a;

    return-void
.end method


# virtual methods
.method public a()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Lw/u0;->a:Lw/u0$a;

    invoke-virtual {v0}, Lw/u0$a;->b()Landroid/util/Size;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lw/u0;->a:Lw/u0$a;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lw/u0;->a:Lw/u0$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw/u0;->a:Lw/u0$a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
