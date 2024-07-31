.class public Lca/i;
.super Lca/o;
.source "SourceFile"


# instance fields
.field private final b:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lca/o;-><init>(Ljava/lang/String;Landroid/content/Intent;)V

    iput p1, p0, Lca/i;->b:I

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lca/i;->b:I

    return v0
.end method
