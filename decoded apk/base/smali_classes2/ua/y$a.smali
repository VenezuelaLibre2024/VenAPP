.class public final Lua/y$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lua/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:F

.field private b:I

.field private c:I

.field private d:Z

.field private e:Lua/x;


# direct methods
.method public constructor <init>(Lua/y;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lua/y;->w1()F

    move-result v0

    iput v0, p0, Lua/y$a;->a:F

    invoke-virtual {p1}, Lua/y;->x1()Landroid/util/Pair;

    move-result-object v0

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p0, Lua/y$a;->b:I

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lua/y$a;->c:I

    invoke-virtual {p1}, Lua/y;->v1()Z

    move-result v0

    iput-boolean v0, p0, Lua/y$a;->d:Z

    invoke-virtual {p1}, Lua/y;->u1()Lua/x;

    move-result-object p1

    iput-object p1, p0, Lua/y$a;->e:Lua/x;

    return-void
.end method


# virtual methods
.method public a()Lua/y;
    .locals 7

    new-instance v6, Lua/y;

    iget v1, p0, Lua/y$a;->a:F

    iget v2, p0, Lua/y$a;->b:I

    iget v3, p0, Lua/y$a;->c:I

    iget-boolean v4, p0, Lua/y$a;->d:Z

    iget-object v5, p0, Lua/y$a;->e:Lua/x;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lua/y;-><init>(FIIZLua/x;)V

    return-object v6
.end method

.method public final b(Z)Lua/y$a;
    .locals 0

    iput-boolean p1, p0, Lua/y$a;->d:Z

    return-object p0
.end method

.method public final c(F)Lua/y$a;
    .locals 0

    iput p1, p0, Lua/y$a;->a:F

    return-object p0
.end method
