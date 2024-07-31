.class final Lg9/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lg9/u;


# direct methods
.method constructor <init>(Lg9/u;)V
    .locals 0

    iput-object p1, p0, Lg9/m;->a:Lg9/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lg9/m;->a:Lg9/u;

    const/4 v0, 0x2

    iput v0, p1, Lg9/u;->G:I

    iget-object p1, p1, Lg9/u;->a:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
