.class public final synthetic Le0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:Le0/e;


# direct methods
.method public synthetic constructor <init>(Le0/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le0/d;->a:Le0/e;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Le0/d;->a:Le0/e;

    check-cast p1, Landroidx/camera/core/impl/y1$e;

    check-cast p2, Landroidx/camera/core/impl/y1$e;

    invoke-static {v0, p1, p2}, Le0/e;->a(Le0/e;Landroidx/camera/core/impl/y1$e;Landroidx/camera/core/impl/y1$e;)I

    move-result p1

    return p1
.end method
