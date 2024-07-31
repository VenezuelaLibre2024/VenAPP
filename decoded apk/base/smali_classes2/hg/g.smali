.class abstract Lhg/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final b:Lhg/g;


# instance fields
.field private final a:Lhg/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhg/e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lhg/e;-><init>(Lhg/g;II)V

    sput-object v0, Lhg/g;->b:Lhg/g;

    return-void
.end method

.method constructor <init>(Lhg/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhg/g;->a:Lhg/g;

    return-void
.end method


# virtual methods
.method final a(II)Lhg/g;
    .locals 1

    new-instance v0, Lhg/e;

    invoke-direct {v0, p0, p1, p2}, Lhg/e;-><init>(Lhg/g;II)V

    return-object v0
.end method

.method final b(II)Lhg/g;
    .locals 1

    new-instance v0, Lhg/b;

    invoke-direct {v0, p0, p1, p2}, Lhg/b;-><init>(Lhg/g;II)V

    return-object v0
.end method

.method abstract c(Lkg/a;[B)V
.end method

.method final d()Lhg/g;
    .locals 1

    iget-object v0, p0, Lhg/g;->a:Lhg/g;

    return-object v0
.end method
