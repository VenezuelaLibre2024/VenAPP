.class public final synthetic Landroidx/core/content/res/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/core/content/res/f$e;

.field public final synthetic b:Landroid/graphics/Typeface;


# direct methods
.method public synthetic constructor <init>(Landroidx/core/content/res/f$e;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/core/content/res/g;->a:Landroidx/core/content/res/f$e;

    iput-object p2, p0, Landroidx/core/content/res/g;->b:Landroid/graphics/Typeface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/core/content/res/g;->a:Landroidx/core/content/res/f$e;

    iget-object v1, p0, Landroidx/core/content/res/g;->b:Landroid/graphics/Typeface;

    invoke-static {v0, v1}, Landroidx/core/content/res/f$e;->b(Landroidx/core/content/res/f$e;Landroid/graphics/Typeface;)V

    return-void
.end method