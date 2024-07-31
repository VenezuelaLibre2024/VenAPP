.class public interface abstract Lyl/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyl/l$a;
    }
.end annotation


# static fields
.field public static final a:Lyl/l$a;

.field public static final b:Lyl/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lyl/l$a;->a:Lyl/l$a;

    sput-object v0, Lyl/l;->a:Lyl/l$a;

    new-instance v0, Lyl/l$a$a;

    invoke-direct {v0}, Lyl/l$a$a;-><init>()V

    sput-object v0, Lyl/l;->b:Lyl/l;

    return-void
.end method


# virtual methods
.method public abstract a(ILdm/d;IZ)Z
.end method

.method public abstract b(ILyl/b;)V
.end method

.method public abstract c(ILjava/util/List;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lyl/c;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract d(ILjava/util/List;Z)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lyl/c;",
            ">;Z)Z"
        }
    .end annotation
.end method
