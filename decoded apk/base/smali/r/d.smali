.class Lr/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/b$a;


# static fields
.field static final a:Lr/b;

.field private static final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lw/y;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr/b;

    new-instance v1, Lr/d;

    invoke-direct {v1}, Lr/d;-><init>()V

    invoke-direct {v0, v1}, Lr/b;-><init>(Lr/b$a;)V

    sput-object v0, Lr/d;->a:Lr/b;

    sget-object v0, Lw/y;->d:Lw/y;

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lr/d;->b:Ljava/util/Set;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/hardware/camera2/params/DynamicRangeProfiles;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public b(Lw/y;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/y;",
            ")",
            "Ljava/util/Set<",
            "Lw/y;",
            ">;"
        }
    .end annotation

    sget-object v0, Lw/y;->d:Lw/y;

    invoke-virtual {v0, p1}, Lw/y;->equals(Ljava/lang/Object;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DynamicRange is not supported: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    sget-object p1, Lr/d;->b:Ljava/util/Set;

    return-object p1
.end method

.method public c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lw/y;",
            ">;"
        }
    .end annotation

    sget-object v0, Lr/d;->b:Ljava/util/Set;

    return-object v0
.end method
