.class Lrb/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrb/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrb/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Ljb/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljb/v<",
            "Lrb/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljb/v;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljb/v<",
            "Lrb/g;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrb/h$b;->a:Ljb/v;

    return-void
.end method

.method synthetic constructor <init>(Ljb/v;Lrb/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lrb/h$b;-><init>(Ljb/v;)V

    return-void
.end method
