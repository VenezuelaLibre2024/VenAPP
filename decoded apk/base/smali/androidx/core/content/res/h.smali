.class public final synthetic Landroidx/core/content/res/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/core/content/res/f$e;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Landroidx/core/content/res/f$e;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/core/content/res/h;->a:Landroidx/core/content/res/f$e;

    iput p2, p0, Landroidx/core/content/res/h;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/core/content/res/h;->a:Landroidx/core/content/res/f$e;

    iget v1, p0, Landroidx/core/content/res/h;->b:I

    invoke-static {v0, v1}, Landroidx/core/content/res/f$e;->a(Landroidx/core/content/res/f$e;I)V

    return-void
.end method
