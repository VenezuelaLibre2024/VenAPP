.class public final synthetic Landroidx/camera/camera2/internal/z1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/LinkedHashSet;


# direct methods
.method public synthetic constructor <init>(Ljava/util/LinkedHashSet;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/z1;->a:Ljava/util/LinkedHashSet;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/z1;->a:Ljava/util/LinkedHashSet;

    invoke-static {v0}, Landroidx/camera/camera2/internal/a2$a;->a(Ljava/util/LinkedHashSet;)V

    return-void
.end method
