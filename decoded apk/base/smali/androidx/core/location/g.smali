.class public final synthetic Landroidx/core/location/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/core/location/b$d;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Landroidx/core/location/b$d;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/core/location/g;->a:Landroidx/core/location/b$d;

    iput p2, p0, Landroidx/core/location/g;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/core/location/g;->a:Landroidx/core/location/b$d;

    iget v1, p0, Landroidx/core/location/g;->b:I

    invoke-static {v0, v1}, Landroidx/core/location/b$d;->d(Landroidx/core/location/b$d;I)V

    return-void
.end method
